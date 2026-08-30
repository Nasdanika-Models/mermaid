/**
 */
package org.nasdanika.models.mermaid.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.diagram.DiagramPackage;

import org.nasdanika.models.mermaid.DiagramKind;
import org.nasdanika.models.mermaid.MermaidDiagram;
import org.nasdanika.models.mermaid.MermaidFactory;
import org.nasdanika.models.mermaid.MermaidPackage;

import org.nasdanika.models.nxcore.NxcorePackage;

import org.nasdanika.models.presentation.PresentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MermaidPackageImpl extends EPackageImpl implements MermaidPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mermaidDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diagramKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.mermaid.MermaidPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MermaidPackageImpl() {
		super(eNS_URI, MermaidFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MermaidPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MermaidPackage init() {
		if (isInited) return (MermaidPackage)EPackage.Registry.INSTANCE.getEPackage(MermaidPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMermaidPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MermaidPackageImpl theMermaidPackage = registeredMermaidPackage instanceof MermaidPackageImpl ? (MermaidPackageImpl)registeredMermaidPackage : new MermaidPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		PresentationPackage.eINSTANCE.eClass();
		NxcorePackage.eINSTANCE.eClass();
		DiagramPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMermaidPackage.createPackageContents();

		// Initialize created meta-data
		theMermaidPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMermaidPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MermaidPackage.eNS_URI, theMermaidPackage);
		return theMermaidPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMermaidDiagram() {
		return mermaidDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMermaidDiagram_Kind() {
		return (EAttribute)mermaidDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMermaidDiagram_Source() {
		return (EAttribute)mermaidDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMermaidDiagram_FrontMatter() {
		return (EAttribute)mermaidDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMermaidDiagram_Parsed() {
		return (EAttribute)mermaidDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiagramKind() {
		return diagramKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MermaidFactory getMermaidFactory() {
		return (MermaidFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mermaidDiagramEClass = createEClass(MERMAID_DIAGRAM);
		createEAttribute(mermaidDiagramEClass, MERMAID_DIAGRAM__KIND);
		createEAttribute(mermaidDiagramEClass, MERMAID_DIAGRAM__SOURCE);
		createEAttribute(mermaidDiagramEClass, MERMAID_DIAGRAM__FRONT_MATTER);
		createEAttribute(mermaidDiagramEClass, MERMAID_DIAGRAM__PARSED);

		// Create enums
		diagramKindEEnum = createEEnum(DIAGRAM_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PresentationPackage thePresentationPackage = (PresentationPackage)EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mermaidDiagramEClass.getESuperTypes().add(thePresentationPackage.getSlide());

		// Initialize classes, features, and operations; add parameters
		initEClass(mermaidDiagramEClass, MermaidDiagram.class, "MermaidDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMermaidDiagram_Kind(), this.getDiagramKind(), "kind", null, 0, 1, MermaidDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMermaidDiagram_Source(), theEcorePackage.getEString(), "source", null, 0, 1, MermaidDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMermaidDiagram_FrontMatter(), theEcorePackage.getEString(), "frontMatter", null, 0, 1, MermaidDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMermaidDiagram_Parsed(), theEcorePackage.getEBoolean(), "parsed", null, 0, 1, MermaidDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(diagramKindEEnum, DiagramKind.class, "DiagramKind");
		addEEnumLiteral(diagramKindEEnum, DiagramKind.FLOWCHART);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.SEQUENCE);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.CLASS);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.STATE);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.ER);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.USER_JOURNEY);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.GANTT);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.PIE);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.QUADRANT);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.REQUIREMENT);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.GITGRAPH);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.C4);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.MINDMAP);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.TIMELINE);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.ZENUML);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.SANKEY);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.XY_CHART);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.BLOCK);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.PACKET);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.KANBAN);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.ARCHITECTURE);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.RADAR);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.TREEMAP);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.SWIMLANES);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.EVENT_MODELING);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.VENN);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.ISHIKAWA);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.WARDLEY);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.CYNEFIN);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.TREEVIEW);
		addEEnumLiteral(diagramKindEEnum, DiagramKind.OTHER);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "modelDirectory", "/model/src-gen",
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "21",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.models"
		   });
		addAnnotation
		  (diagramKindEEnum,
		   source,
		   new String[] {
			   "documentation", "Tracks the published Mermaid diagram type set (https://mermaid.js.org/intro/).\nThere is no shared grammar behind these: each kind is its own mini-language,\nhence per-kind parsers and OTHER as the safety net for new kinds."
		   });
		addAnnotation
		  (mermaidDiagramEClass,
		   source,
		   new String[] {
			   "documentation", "One Mermaid diagram: the whole body of a .mmd/.mermaid file (and its resource\nroot), or one fenced block extracted from Markdown. A frontmatter title is\nloaded into the inherited Slide title as a convenience; frontMatter below stays\nthe verbatim record."
		   });
		addAnnotation
		  (getMermaidDiagram_Kind(),
		   source,
		   new String[] {
			   "documentation", " Derived from the first non-comment, non-frontmatter line (the type keyword)."
		   });
		addAnnotation
		  (getMermaidDiagram_Source(),
		   source,
		   new String[] {
			   "documentation", "Full source text of the diagram (without Markdown fence delimiters and\nwithout the frontmatter block) - always preserved; save re-emits it\nverbatim when structure was not modified. %%{init}%% directives and\n%% comments stay embedded in the source."
		   });
		addAnnotation
		  (getMermaidDiagram_FrontMatter(),
		   source,
		   new String[] {
			   "documentation", "YAML frontmatter block (between --- delimiters), verbatim: title, config,\ndisplayMode, theme. Also the sanctioned annotation carrier for\ncomposability - a conventional key is parsed on load into diagram\nproperties / modelElement bindings and re-emitted on save, the same\ntechnique as speaker notes in the Presentation model."
		   });
		addAnnotation
		  (getMermaidDiagram_Parsed(),
		   source,
		   new String[] {
			   "documentation", "Structural view (flowchart nodes/participants/classes as diagram nodes,\nedges/messages/relations as connections) populated by kind-specific\nparsers where implemented; inherited children/connections from Diagram\nare used for this. \'parsed\' indicates whether the structural view is\nauthoritative."
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

} //MermaidPackageImpl
