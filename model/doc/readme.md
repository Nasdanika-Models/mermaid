
```drawio-resource
../mermaid.drawio
```

[TOC levels=6]

An [Ecore](https://www.eclipse.org/modeling/emf/) model of [Mermaid](https://mermaid.ai/open-source/) diagrams as model resources.
It is a slide-level member of the [presentation floor](https://presentation.models.nasdanika.org/), next to the [PlantUML model](https://plantuml.models.nasdanika.org/) but one notch lighter, because the formats differ where it counts: PlantUML has `@startuml` delimiters, so a `.puml` file is a document of blocks and `PlantUmlDocument` extends `Presentation`; Mermaid has no delimiters - a file is a single diagram, the type keyword after optional frontmatter - so there is no document class here.
`MermaidDiagram` extends `Slide` and is itself the resource root: a slide without a deck.
Multi-diagram collections arise only from Markdown extraction and aggregate under plain presentation `Presentation`, which is also what lets one mixed deck hold Mermaid slides next to PlantUML blocks and Draw.io pages.

The immediate reason this model exists is ecosystem gravity.
Mermaid renders natively in GitHub, GitLab, Obsidian, Notion, and virtually every Markdown surface that matters, it is the diagram notation LLMs emit by default, and [Draw.io is sunsetting its PlantUML support in favor of Mermaid](https://www.drawio.com/blog/plantuml-to-mermaid) (end of 2025 for the online editor, 2028 for Confluence and Jira Cloud).
None of that makes Mermaid a better notation than PlantUML.
It makes Mermaid the notation that is present wherever documents are already being read, which for a family whose point is format-neutral exchange is reason enough for a floor.

## Competitive landscape

**Mermaid itself.** The library lives in the browser and renders text to SVG on page load; the diagram evaporates into pixels. There is no server-side story, no stable element identity, no cross-diagram references, no way to ask "which diagrams depict this component". The model addresses everything after rendering: querying, validation, generation, migration, and mapping to semantic models.

**PlantUML.** A sibling, not a competitor. PlantUML remains the more expressive notation (component and deployment diagrams, layout control, preprocessing), and the PlantUML model is not going anywhere.
Both load into the same `Presentation`/`Diagram` base, so everything above the floor is format-neutral; supporting both is precisely what turns the Draw.io sunset from a loss into a migration path.

## What a typed model adds

**Generation where Markdown renders.** Because a slide is a diagram, anything the tower can express as a `Diagram` can be saved as Mermaid and dropped into a README, a pull request description, a wiki page, or a generated documentation site, and every forge renders it with no plugin, no viewer, no install. This is the cheapest distribution surface the family has: the Draw.io model's free-viewer story with the viewer already embedded in the page.

**Identity and annotation via frontmatter.** Mermaid's YAML frontmatter is the sanctioned metadata slot, and the model uses it the way the Presentation model uses speaker notes: a conventional key carries element identifiers and semantic mapping bindings, parsed on load into diagram properties and `modelElement` references, re-emitted on save.
Diagrams acquire stable identity and become mappable to architecture models without the notation itself supporting either.

**Agent-facing notation.** LLMs produce Mermaid fluently and unprompted. Parsing agent-drawn diagrams into the typed diagram model, validating them, and merging them into semantic models is draw-first, execute-later with the agent holding the pen; the model is the checkpoint between "plausible picture" and "statement about the system".

## Applications

**Documentation sites and forges.** Generated views emitted as Mermaid wherever the target surface is Markdown: architecture overviews in READMEs, dependency graphs in merge requests, status boards in wikis, all regenerated from models rather than redrawn.

**Animation scripts for Draw.io.** A sequence diagram is an animation script by construction: participants in columns, messages in order, time flowing down the page.
An animation starter button on a Draw.io drawing references a `.mmd` resource by property; the `animate` CLI command loads it through this model, and a capability-resolved generator matches participants to the cells that depict them and emits typed highlight and flow steps behind the button.
One interaction, stated once, shown twice: in time here, in space on the drawing people already trust.
This is why the sequence parser goes first among the kind-specific parsers, and it sharpens the agent story below: an agent that emits a sequence diagram has described an interaction in a checkable form, which beats asking it to be careful with action JSON.

**Sketch-to-model intake.** An agent or a human sketches in Mermaid because it is the lowest-friction notation available in a chat window; the model lifts the sketch into typed diagram elements and maps them to architecture elements, so the sketch graduates into the estate instead of dying in the conversation.

**Diagram estates as data.** Every fenced Mermaid block in a repository, extracted, classified by kind, and queried: which diagrams exist, what do they depict, which reference elements that no longer exist. The dead-diagram detection sibling of dead-element detection elsewhere in the tower.

## Model overview

| Area | Types |
|------|-------|
| Document | none - a `.mmd` file is a single diagram and `MermaidDiagram` is the resource root; Markdown-extracted collections aggregate under plain presentation `Presentation` |
| Diagram | `MermaidDiagram` extends `Slide`: `kind`, verbatim `source`, `frontMatter`, `parsed`; a frontmatter title loads into the inherited slide `title` |
| Kinds | `DiagramKind` tracking the published Mermaid set: flowchart, sequence, class, state, ER, user journey, gantt, pie, quadrant, requirement, gitgraph, C4, mindmap, timeline, zenuml, sankey, XY chart, block, packet, kanban, architecture, radar, treemap, swimlanes, event modeling, venn, ishikawa, wardley, cynefin, treeview, with `OTHER` for kinds the enum does not know yet |
| Reused, not redefined | presentation `Presentation`, `Slide`; diagram `Node`, `Connection`, `Property` |

## Loading and validation

There is no Java Mermaid parser worth depending on, and the JavaScript one is only half portable: Mermaid's newer diagram types parse through the Langium-based [`@mermaid-js/parser`](https://www.npmjs.com/package/@mermaid-js/parser), while the core types (flowchart, sequence, class, state, ER, gantt) still use Jison grammars entangled with the browser bundle.
The loading strategy is therefore text-first in plain Java: split frontmatter, detect the kind from the first meaningful line, preserve the source, and add per-kind statement-level parsers incrementally, the same division of labor as the PlantUML model.

## Relation to other Nasdanika work

Base classes come from the [Presentation model](https://presentation.models.nasdanika.org/) over the [Diagram model](https://diagram.models.nasdanika.org/): a Mermaid diagram is a slide is a diagram, exchangeable with [Draw.io](https://drawio.models.nasdanika.org/), [PowerPoint](https://powerpoint.models.nasdanika.org/), [Visio](https://visio.models.nasdanika.org/), and [PlantUML](https://plantuml.models.nasdanika.org/) through the shared base, and renderable through the [Sprotty model](https://sprotty.models.nasdanika.org/) where live or animated output is wanted.
Fenced-block extraction from Markdown belongs to the Markdown side of the house and reuses its composability conventions.
Semantic mapping targets are the architecture and C4 floors of the model tower, the same mapping story as the Draw.io model's custom links, expressed here through frontmatter rather than link URIs.
The Draw.io model's animation machinery consumes this model as an authoring source: sequence diagrams referenced from animation buttons, generated into typed action steps by the `animate` CLI command through capability-resolved generators.
