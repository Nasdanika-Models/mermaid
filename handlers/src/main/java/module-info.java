import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.mermaid.handlers.MermaidToEcoreArrayResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.mermaid.handlers.MermaidToEcoreResourceContentsHandlerCapabilityFactory;

module org.nasdanika.models.mermaid.handlers {
	
	exports org.nasdanika.models.mermaid.handlers;
	opens org.nasdanika.models.mermaid.handlers to org.nasdanika.common; // For transformer
		
	requires transitive org.nasdanika.models.mermaid;
	requires org.apache.commons.lang3;
	requires org.eclipse.emf.ecore;
	
	provides CapabilityFactory with 
		MermaidToEcoreArrayResourceContentsHandlerCapabilityFactory,
		MermaidToEcoreResourceContentsHandlerCapabilityFactory;
	
}