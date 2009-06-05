package org.drools;

/**
 *<p>
 * A class to store KnowledgeBase related configuration. It must be used at KnowledgeBase instantiation time
 * or not used at all.
 * </p>
 *
 * <p>
 * This class will automatically load default values from a number of places, accumulating properties from each location.
 * This list of locations, in given priority is:
 * System properties, home directory, working directory, META-INF/ of optionally provided classLoader
 * META-INF/ of Thread.currentThread().getContextClassLoader() and META-INF/ of  ClassLoader.getSystemClassLoader()
 * </p>
 * 
 * <p>
 * So if you want to set a default configuration value for all your new KnowledgeBase, you can simply set the property as
 * a System property.
 * </p>
 * 
 * <p>
 * After the KnowledgeBase is created, it makes the configuration immutable and there is no way to make it
 * mutable again. This is to avoid inconsistent behaviour inside KnowledgeBase.
 * </p>
 * 
 * <p>
 * The following properties are supported:
 * <ul>
 * <li>drools.maintainTms = &lt;true|false&gt;</li>
 * <li>drools.assertBehaviour = &lt;identity|equality&gt;</li>
 * <li>drools.logicalOverride = &lt;discard|preserve&gt;</li>
 * <li>drools.sequential = &lt;true|false&gt;</li>
 * <li>drools.sequential.agenda = &lt;sequential|dynamic&gt;</li>
 * <li>drools.removeIdentities = &lt;true|false&gt;</li>
 * <li>drools.shareAlphaNodes  = &lt;true|false&gt;</li>
 * <li>drools.shareBetaNodes = &lt;true|false&gt;</li>
 * <li>drools.alphaMemory = &lt;true/false&gt;</li>
 * <li>drools.alphaNodeHashingThreshold = &lt;1...n&gt;</li>
 * <li>drools.compositeKeyDepth  = &lt;1..3&gt;</li>
 * <li>drools.indexLeftBetaMemory = &lt;true/false&gt;</li>
 * <li>drools.indexRightBetaMemory = &lt;true/false&gt;</li>
 * <li>drools.consequenceExceptionHandler = &lt;qualified class name&gt;</li>
 * </ul>
 * </p>
 * 
 * 
 * <p>
 * The follow properties have not yet been migrated from the Drools 4.0 api:
 * <ul>
 * <li>drools.executorService = &lt;qualified class name&gt;</li>
 * <li>drools.conflictResolver = &lt;qualified class name&gt;</li>
 * <li>drools.ruleBaseUpdateHandler = &lt;qualified class name&gt;</li>
 * </ul>
 * </p>
 */
public interface KnowledgeBaseConfiguration
    extends
    PropertiesConfiguration {

}