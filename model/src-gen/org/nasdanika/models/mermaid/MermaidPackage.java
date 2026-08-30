/**
 */
package org.nasdanika.models.mermaid;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.nasdanika.models.presentation.PresentationPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.mermaid.MermaidFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/model/src-gen' featureDelegation='Dynamic' complianceLevel='21' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface MermaidPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mermaid";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://mermaid.models.nasdanika.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.mermaid";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MermaidPackage eINSTANCE = org.nasdanika.models.mermaid.impl.MermaidPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.mermaid.impl.MermaidDiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.mermaid.impl.MermaidDiagramImpl
	 * @see org.nasdanika.models.mermaid.impl.MermaidPackageImpl#getMermaidDiagram()
	 * @generated
	 */
	int MERMAID_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM__ID = PresentationPackage.SLIDE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM__DOCUMENTATION = PresentationPackage.SLIDE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM__DOC_REF = PresentationPackage.SLIDE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM__DOC_FORMAT = PresentationPackage.SLIDE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM__DOC_CONTENTS = PresentationPackage.SLIDE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM__DOC_SECTIONS = PresentationPackage.SLIDE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM__MARKERS = PresentationPackage.SLIDE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM__ICON = PresentationPackage.SLIDE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM__URIS = PresentationPackage.SLIDE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM__NAME = PresentationPackage.SLIDE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM__TAGS = PresentationPackage.SLIDE__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM__PROPERTIES = PresentationPackage.SLIDE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Semantic Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM__SEMANTIC_ELEMENTS = PresentationPackage.SLIDE__SEMANTIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM__CHILDREN = PresentationPackage.SLIDE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM__MASTER = PresentationPackage.SLIDE__MASTER;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM__HIDDEN = PresentationPackage.SLIDE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM__NOTES = PresentationPackage.SLIDE__NOTES;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM__KIND = PresentationPackage.SLIDE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM__SOURCE = PresentationPackage.SLIDE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Front Matter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM__FRONT_MATTER = PresentationPackage.SLIDE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM__PARSED = PresentationPackage.SLIDE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM_FEATURE_COUNT = PresentationPackage.SLIDE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM___COLLECT__OBJECT_EREFERENCE_ELIST = PresentationPackage.SLIDE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM___GET_REFERRERS__EREFERENCE = PresentationPackage.SLIDE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERMAID_DIAGRAM_OPERATION_COUNT = PresentationPackage.SLIDE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.mermaid.DiagramKind <em>Diagram Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.mermaid.DiagramKind
	 * @see org.nasdanika.models.mermaid.impl.MermaidPackageImpl#getDiagramKind()
	 * @generated
	 */
	int DIAGRAM_KIND = 1;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.mermaid.MermaidDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see org.nasdanika.models.mermaid.MermaidDiagram
	 * @generated
	 */
	EClass getMermaidDiagram();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.mermaid.MermaidDiagram#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.nasdanika.models.mermaid.MermaidDiagram#getKind()
	 * @see #getMermaidDiagram()
	 * @generated
	 */
	EAttribute getMermaidDiagram_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.mermaid.MermaidDiagram#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.nasdanika.models.mermaid.MermaidDiagram#getSource()
	 * @see #getMermaidDiagram()
	 * @generated
	 */
	EAttribute getMermaidDiagram_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.mermaid.MermaidDiagram#getFrontMatter <em>Front Matter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Front Matter</em>'.
	 * @see org.nasdanika.models.mermaid.MermaidDiagram#getFrontMatter()
	 * @see #getMermaidDiagram()
	 * @generated
	 */
	EAttribute getMermaidDiagram_FrontMatter();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.mermaid.MermaidDiagram#isParsed <em>Parsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parsed</em>'.
	 * @see org.nasdanika.models.mermaid.MermaidDiagram#isParsed()
	 * @see #getMermaidDiagram()
	 * @generated
	 */
	EAttribute getMermaidDiagram_Parsed();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.mermaid.DiagramKind <em>Diagram Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diagram Kind</em>'.
	 * @see org.nasdanika.models.mermaid.DiagramKind
	 * @generated
	 */
	EEnum getDiagramKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MermaidFactory getMermaidFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.mermaid.impl.MermaidDiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.mermaid.impl.MermaidDiagramImpl
		 * @see org.nasdanika.models.mermaid.impl.MermaidPackageImpl#getMermaidDiagram()
		 * @generated
		 */
		EClass MERMAID_DIAGRAM = eINSTANCE.getMermaidDiagram();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERMAID_DIAGRAM__KIND = eINSTANCE.getMermaidDiagram_Kind();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERMAID_DIAGRAM__SOURCE = eINSTANCE.getMermaidDiagram_Source();

		/**
		 * The meta object literal for the '<em><b>Front Matter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERMAID_DIAGRAM__FRONT_MATTER = eINSTANCE.getMermaidDiagram_FrontMatter();

		/**
		 * The meta object literal for the '<em><b>Parsed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERMAID_DIAGRAM__PARSED = eINSTANCE.getMermaidDiagram_Parsed();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.mermaid.DiagramKind <em>Diagram Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.mermaid.DiagramKind
		 * @see org.nasdanika.models.mermaid.impl.MermaidPackageImpl#getDiagramKind()
		 * @generated
		 */
		EEnum DIAGRAM_KIND = eINSTANCE.getDiagramKind();

	}

} //MermaidPackage
