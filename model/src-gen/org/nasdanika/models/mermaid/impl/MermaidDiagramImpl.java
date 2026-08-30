/**
 */
package org.nasdanika.models.mermaid.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.mermaid.DiagramKind;
import org.nasdanika.models.mermaid.MermaidDiagram;
import org.nasdanika.models.mermaid.MermaidPackage;

import org.nasdanika.models.presentation.impl.SlideImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.mermaid.impl.MermaidDiagramImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.models.mermaid.impl.MermaidDiagramImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.mermaid.impl.MermaidDiagramImpl#getFrontMatter <em>Front Matter</em>}</li>
 *   <li>{@link org.nasdanika.models.mermaid.impl.MermaidDiagramImpl#isParsed <em>Parsed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MermaidDiagramImpl extends SlideImpl implements MermaidDiagram {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final DiagramKind KIND_EDEFAULT = DiagramKind.FLOWCHART;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFrontMatter() <em>Front Matter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontMatter()
	 * @generated
	 * @ordered
	 */
	protected static final String FRONT_MATTER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isParsed() <em>Parsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARSED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MermaidDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MermaidPackage.Literals.MERMAID_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramKind getKind() {
		return (DiagramKind)eDynamicGet(MermaidPackage.MERMAID_DIAGRAM__KIND, MermaidPackage.Literals.MERMAID_DIAGRAM__KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(DiagramKind newKind) {
		eDynamicSet(MermaidPackage.MERMAID_DIAGRAM__KIND, MermaidPackage.Literals.MERMAID_DIAGRAM__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return (String)eDynamicGet(MermaidPackage.MERMAID_DIAGRAM__SOURCE, MermaidPackage.Literals.MERMAID_DIAGRAM__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		eDynamicSet(MermaidPackage.MERMAID_DIAGRAM__SOURCE, MermaidPackage.Literals.MERMAID_DIAGRAM__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrontMatter() {
		return (String)eDynamicGet(MermaidPackage.MERMAID_DIAGRAM__FRONT_MATTER, MermaidPackage.Literals.MERMAID_DIAGRAM__FRONT_MATTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrontMatter(String newFrontMatter) {
		eDynamicSet(MermaidPackage.MERMAID_DIAGRAM__FRONT_MATTER, MermaidPackage.Literals.MERMAID_DIAGRAM__FRONT_MATTER, newFrontMatter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isParsed() {
		return (Boolean)eDynamicGet(MermaidPackage.MERMAID_DIAGRAM__PARSED, MermaidPackage.Literals.MERMAID_DIAGRAM__PARSED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParsed(boolean newParsed) {
		eDynamicSet(MermaidPackage.MERMAID_DIAGRAM__PARSED, MermaidPackage.Literals.MERMAID_DIAGRAM__PARSED, newParsed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MermaidPackage.MERMAID_DIAGRAM__KIND:
				return getKind();
			case MermaidPackage.MERMAID_DIAGRAM__SOURCE:
				return getSource();
			case MermaidPackage.MERMAID_DIAGRAM__FRONT_MATTER:
				return getFrontMatter();
			case MermaidPackage.MERMAID_DIAGRAM__PARSED:
				return isParsed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MermaidPackage.MERMAID_DIAGRAM__KIND:
				setKind((DiagramKind)newValue);
				return;
			case MermaidPackage.MERMAID_DIAGRAM__SOURCE:
				setSource((String)newValue);
				return;
			case MermaidPackage.MERMAID_DIAGRAM__FRONT_MATTER:
				setFrontMatter((String)newValue);
				return;
			case MermaidPackage.MERMAID_DIAGRAM__PARSED:
				setParsed((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MermaidPackage.MERMAID_DIAGRAM__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case MermaidPackage.MERMAID_DIAGRAM__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case MermaidPackage.MERMAID_DIAGRAM__FRONT_MATTER:
				setFrontMatter(FRONT_MATTER_EDEFAULT);
				return;
			case MermaidPackage.MERMAID_DIAGRAM__PARSED:
				setParsed(PARSED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MermaidPackage.MERMAID_DIAGRAM__KIND:
				return getKind() != KIND_EDEFAULT;
			case MermaidPackage.MERMAID_DIAGRAM__SOURCE:
				return SOURCE_EDEFAULT == null ? getSource() != null : !SOURCE_EDEFAULT.equals(getSource());
			case MermaidPackage.MERMAID_DIAGRAM__FRONT_MATTER:
				return FRONT_MATTER_EDEFAULT == null ? getFrontMatter() != null : !FRONT_MATTER_EDEFAULT.equals(getFrontMatter());
			case MermaidPackage.MERMAID_DIAGRAM__PARSED:
				return isParsed() != PARSED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //MermaidDiagramImpl
