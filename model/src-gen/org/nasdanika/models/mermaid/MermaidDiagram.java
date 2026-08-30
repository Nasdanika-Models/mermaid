/**
 */
package org.nasdanika.models.mermaid;

import org.nasdanika.models.presentation.Slide;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One Mermaid diagram: the whole body of a .mmd/.mermaid file (and its resource
 * root), or one fenced block extracted from Markdown. A frontmatter title is
 * loaded into the inherited Slide title as a convenience; frontMatter below stays
 * the verbatim record.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.mermaid.MermaidDiagram#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.models.mermaid.MermaidDiagram#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.mermaid.MermaidDiagram#getFrontMatter <em>Front Matter</em>}</li>
 *   <li>{@link org.nasdanika.models.mermaid.MermaidDiagram#isParsed <em>Parsed</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.mermaid.MermaidPackage#getMermaidDiagram()
 * @model
 * @generated
 */
public interface MermaidDiagram extends Slide {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.mermaid.DiagramKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Derived from the first non-comment, non-frontmatter line (the type keyword).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.models.mermaid.DiagramKind
	 * @see #setKind(DiagramKind)
	 * @see org.nasdanika.models.mermaid.MermaidPackage#getMermaidDiagram_Kind()
	 * @model unique="false"
	 * @generated
	 */
	DiagramKind getKind();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.mermaid.MermaidDiagram#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.models.mermaid.DiagramKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(DiagramKind value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full source text of the diagram (without Markdown fence delimiters and
	 * without the frontmatter block) - always preserved; save re-emits it
	 * verbatim when structure was not modified. %%{init}%% directives and
	 * %% comments stay embedded in the source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.nasdanika.models.mermaid.MermaidPackage#getMermaidDiagram_Source()
	 * @model unique="false"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.mermaid.MermaidDiagram#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Front Matter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * YAML frontmatter block (between --- delimiters), verbatim: title, config,
	 * displayMode, theme. Also the sanctioned annotation carrier for
	 * composability - a conventional key is parsed on load into diagram
	 * properties / modelElement bindings and re-emitted on save, the same
	 * technique as speaker notes in the Presentation model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Front Matter</em>' attribute.
	 * @see #setFrontMatter(String)
	 * @see org.nasdanika.models.mermaid.MermaidPackage#getMermaidDiagram_FrontMatter()
	 * @model unique="false"
	 * @generated
	 */
	String getFrontMatter();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.mermaid.MermaidDiagram#getFrontMatter <em>Front Matter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Front Matter</em>' attribute.
	 * @see #getFrontMatter()
	 * @generated
	 */
	void setFrontMatter(String value);

	/**
	 * Returns the value of the '<em><b>Parsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structural view (flowchart nodes/participants/classes as diagram nodes,
	 * edges/messages/relations as connections) populated by kind-specific
	 * parsers where implemented; inherited children/connections from Diagram
	 * are used for this. 'parsed' indicates whether the structural view is
	 * authoritative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parsed</em>' attribute.
	 * @see #setParsed(boolean)
	 * @see org.nasdanika.models.mermaid.MermaidPackage#getMermaidDiagram_Parsed()
	 * @model unique="false"
	 * @generated
	 */
	boolean isParsed();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.mermaid.MermaidDiagram#isParsed <em>Parsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parsed</em>' attribute.
	 * @see #isParsed()
	 * @generated
	 */
	void setParsed(boolean value);

} // MermaidDiagram
