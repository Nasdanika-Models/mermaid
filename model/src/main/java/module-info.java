import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.mermaid.capability.MermaidArrayResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.mermaid.capability.MermaidEPackageResourceSetCapabilityFactory;
import org.nasdanika.models.mermaid.capability.MermaidResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.mermaid.capability.MermaidResourceFactoryCapabilityFactory;

module org.nasdanika.models.mermaid {
	
	exports org.nasdanika.models.mermaid;
	exports org.nasdanika.models.mermaid.impl;
	exports org.nasdanika.models.mermaid.util;
	exports org.nasdanika.models.mermaid.loader;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.models.presentation;
	
	provides CapabilityFactory with 
		MermaidEPackageResourceSetCapabilityFactory,
		MermaidResourceFactoryCapabilityFactory,
		MermaidResourceContentsHandlerCapabilityFactory,
		MermaidArrayResourceContentsHandlerCapabilityFactory;
	
}