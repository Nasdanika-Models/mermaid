/**
 */
package org.nasdanika.models.mermaid;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Diagram Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Tracks the published Mermaid diagram type set (https://mermaid.js.org/intro/).
 * There is no shared grammar behind these: each kind is its own mini-language,
 * hence per-kind parsers and OTHER as the safety net for new kinds.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.mermaid.MermaidPackage#getDiagramKind()
 * @model
 * @generated
 */
public enum DiagramKind implements Enumerator {
	/**
	 * The '<em><b>FLOWCHART</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWCHART_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWCHART(0, "FLOWCHART", "FLOWCHART"),

	/**
	 * The '<em><b>SEQUENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	SEQUENCE(0, "SEQUENCE", "SEQUENCE"),

	/**
	 * The '<em><b>CLASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	CLASS(0, "CLASS", "CLASS"),

	/**
	 * The '<em><b>STATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE_VALUE
	 * @generated
	 * @ordered
	 */
	STATE(0, "STATE", "STATE"),

	/**
	 * The '<em><b>ER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ER_VALUE
	 * @generated
	 * @ordered
	 */
	ER(0, "ER", "ER"),

	/**
	 * The '<em><b>USER JOURNEY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_JOURNEY_VALUE
	 * @generated
	 * @ordered
	 */
	USER_JOURNEY(0, "USER_JOURNEY", "USER_JOURNEY"),

	/**
	 * The '<em><b>GANTT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GANTT_VALUE
	 * @generated
	 * @ordered
	 */
	GANTT(0, "GANTT", "GANTT"),

	/**
	 * The '<em><b>PIE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIE_VALUE
	 * @generated
	 * @ordered
	 */
	PIE(0, "PIE", "PIE"),

	/**
	 * The '<em><b>QUADRANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUADRANT_VALUE
	 * @generated
	 * @ordered
	 */
	QUADRANT(0, "QUADRANT", "QUADRANT"),

	/**
	 * The '<em><b>REQUIREMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIREMENT(0, "REQUIREMENT", "REQUIREMENT"),

	/**
	 * The '<em><b>GITGRAPH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GITGRAPH_VALUE
	 * @generated
	 * @ordered
	 */
	GITGRAPH(0, "GITGRAPH", "GITGRAPH"),

	/**
	 * The '<em><b>C4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C4_VALUE
	 * @generated
	 * @ordered
	 */
	C4(0, "C4", "C4"),

	/**
	 * The '<em><b>MINDMAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINDMAP_VALUE
	 * @generated
	 * @ordered
	 */
	MINDMAP(0, "MINDMAP", "MINDMAP"),

	/**
	 * The '<em><b>TIMELINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMELINE_VALUE
	 * @generated
	 * @ordered
	 */
	TIMELINE(0, "TIMELINE", "TIMELINE"),

	/**
	 * The '<em><b>ZENUML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZENUML_VALUE
	 * @generated
	 * @ordered
	 */
	ZENUML(0, "ZENUML", "ZENUML"),

	/**
	 * The '<em><b>SANKEY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SANKEY_VALUE
	 * @generated
	 * @ordered
	 */
	SANKEY(0, "SANKEY", "SANKEY"),

	/**
	 * The '<em><b>XY CHART</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XY_CHART_VALUE
	 * @generated
	 * @ordered
	 */
	XY_CHART(0, "XY_CHART", "XY_CHART"),

	/**
	 * The '<em><b>BLOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	BLOCK(0, "BLOCK", "BLOCK"),

	/**
	 * The '<em><b>PACKET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKET_VALUE
	 * @generated
	 * @ordered
	 */
	PACKET(0, "PACKET", "PACKET"),

	/**
	 * The '<em><b>KANBAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KANBAN_VALUE
	 * @generated
	 * @ordered
	 */
	KANBAN(0, "KANBAN", "KANBAN"),

	/**
	 * The '<em><b>ARCHITECTURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCHITECTURE_VALUE
	 * @generated
	 * @ordered
	 */
	ARCHITECTURE(0, "ARCHITECTURE", "ARCHITECTURE"),

	/**
	 * The '<em><b>RADAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADAR_VALUE
	 * @generated
	 * @ordered
	 */
	RADAR(0, "RADAR", "RADAR"),

	/**
	 * The '<em><b>TREEMAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREEMAP_VALUE
	 * @generated
	 * @ordered
	 */
	TREEMAP(0, "TREEMAP", "TREEMAP"),

	/**
	 * The '<em><b>SWIMLANES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWIMLANES_VALUE
	 * @generated
	 * @ordered
	 */
	SWIMLANES(0, "SWIMLANES", "SWIMLANES"),

	/**
	 * The '<em><b>EVENT MODELING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_MODELING_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT_MODELING(0, "EVENT_MODELING", "EVENT_MODELING"),

	/**
	 * The '<em><b>VENN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VENN_VALUE
	 * @generated
	 * @ordered
	 */
	VENN(0, "VENN", "VENN"),

	/**
	 * The '<em><b>ISHIKAWA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISHIKAWA_VALUE
	 * @generated
	 * @ordered
	 */
	ISHIKAWA(0, "ISHIKAWA", "ISHIKAWA"),

	/**
	 * The '<em><b>WARDLEY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARDLEY_VALUE
	 * @generated
	 * @ordered
	 */
	WARDLEY(0, "WARDLEY", "WARDLEY"),

	/**
	 * The '<em><b>CYNEFIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYNEFIN_VALUE
	 * @generated
	 * @ordered
	 */
	CYNEFIN(0, "CYNEFIN", "CYNEFIN"),

	/**
	 * The '<em><b>TREEVIEW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREEVIEW_VALUE
	 * @generated
	 * @ordered
	 */
	TREEVIEW(0, "TREEVIEW", "TREEVIEW"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(0, "OTHER", "OTHER");

	/**
	 * The '<em><b>FLOWCHART</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWCHART
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOWCHART_VALUE = 0;

	/**
	 * The '<em><b>SEQUENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENCE_VALUE = 0;

	/**
	 * The '<em><b>CLASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLASS_VALUE = 0;

	/**
	 * The '<em><b>STATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STATE_VALUE = 0;

	/**
	 * The '<em><b>ER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ER_VALUE = 0;

	/**
	 * The '<em><b>USER JOURNEY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_JOURNEY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USER_JOURNEY_VALUE = 0;

	/**
	 * The '<em><b>GANTT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GANTT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GANTT_VALUE = 0;

	/**
	 * The '<em><b>PIE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PIE_VALUE = 0;

	/**
	 * The '<em><b>QUADRANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUADRANT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUADRANT_VALUE = 0;

	/**
	 * The '<em><b>REQUIREMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIREMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUIREMENT_VALUE = 0;

	/**
	 * The '<em><b>GITGRAPH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GITGRAPH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GITGRAPH_VALUE = 0;

	/**
	 * The '<em><b>C4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int C4_VALUE = 0;

	/**
	 * The '<em><b>MINDMAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINDMAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MINDMAP_VALUE = 0;

	/**
	 * The '<em><b>TIMELINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMELINE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMELINE_VALUE = 0;

	/**
	 * The '<em><b>ZENUML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZENUML
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZENUML_VALUE = 0;

	/**
	 * The '<em><b>SANKEY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SANKEY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SANKEY_VALUE = 0;

	/**
	 * The '<em><b>XY CHART</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XY_CHART
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XY_CHART_VALUE = 0;

	/**
	 * The '<em><b>BLOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLOCK_VALUE = 0;

	/**
	 * The '<em><b>PACKET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PACKET_VALUE = 0;

	/**
	 * The '<em><b>KANBAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KANBAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KANBAN_VALUE = 0;

	/**
	 * The '<em><b>ARCHITECTURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCHITECTURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARCHITECTURE_VALUE = 0;

	/**
	 * The '<em><b>RADAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RADAR_VALUE = 0;

	/**
	 * The '<em><b>TREEMAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREEMAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TREEMAP_VALUE = 0;

	/**
	 * The '<em><b>SWIMLANES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWIMLANES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SWIMLANES_VALUE = 0;

	/**
	 * The '<em><b>EVENT MODELING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_MODELING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_MODELING_VALUE = 0;

	/**
	 * The '<em><b>VENN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VENN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VENN_VALUE = 0;

	/**
	 * The '<em><b>ISHIKAWA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISHIKAWA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISHIKAWA_VALUE = 0;

	/**
	 * The '<em><b>WARDLEY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARDLEY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WARDLEY_VALUE = 0;

	/**
	 * The '<em><b>CYNEFIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYNEFIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CYNEFIN_VALUE = 0;

	/**
	 * The '<em><b>TREEVIEW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREEVIEW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TREEVIEW_VALUE = 0;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 0;

	/**
	 * An array of all the '<em><b>Diagram Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DiagramKind[] VALUES_ARRAY =
		new DiagramKind[] {
			FLOWCHART,
			SEQUENCE,
			CLASS,
			STATE,
			ER,
			USER_JOURNEY,
			GANTT,
			PIE,
			QUADRANT,
			REQUIREMENT,
			GITGRAPH,
			C4,
			MINDMAP,
			TIMELINE,
			ZENUML,
			SANKEY,
			XY_CHART,
			BLOCK,
			PACKET,
			KANBAN,
			ARCHITECTURE,
			RADAR,
			TREEMAP,
			SWIMLANES,
			EVENT_MODELING,
			VENN,
			ISHIKAWA,
			WARDLEY,
			CYNEFIN,
			TREEVIEW,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Diagram Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DiagramKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Diagram Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DiagramKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DiagramKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Diagram Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DiagramKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DiagramKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Diagram Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DiagramKind get(int value) {
		switch (value) {
			case FLOWCHART_VALUE: return FLOWCHART;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DiagramKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DiagramKind
