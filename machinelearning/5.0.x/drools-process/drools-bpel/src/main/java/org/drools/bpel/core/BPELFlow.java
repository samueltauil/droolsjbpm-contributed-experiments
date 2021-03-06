package org.drools.bpel.core;

import java.util.Iterator;
import java.util.List;

import org.drools.workflow.core.Node;
import org.drools.workflow.core.impl.ConnectionImpl;
import org.drools.workflow.core.node.CompositeNode;
import org.drools.workflow.core.node.Join;
import org.drools.workflow.core.node.Split;

/**
 * 
 * @author <a href="mailto:kris_verlaenen@hotmail.com">Kris Verlaenen</a>
 */
public class BPELFlow extends CompositeNode implements BPELActivity {
    
    private static final long serialVersionUID = 400L;
    
    private Split split;
    private Join join;
    private String[] links;
    private SourceLink[] sourceLinks;
    private TargetLink[] targetLinks;
    
    public BPELFlow() {
        split = new Split();
        split.setType(Split.TYPE_AND);
        split.setMetaData("hidden", true);
        addNode(split);
        join = new Join();
        join.setType(Join.TYPE_AND);
        join.setMetaData("hidden", true);
        addNode(join);
        linkIncomingConnections(
            Node.CONNECTION_DEFAULT_TYPE,
            new CompositeNode.NodeAndType(
                split, Node.CONNECTION_DEFAULT_TYPE));
        linkOutgoingConnections(
            new CompositeNode.NodeAndType(
                join, Node.CONNECTION_DEFAULT_TYPE),
            Node.CONNECTION_DEFAULT_TYPE);
    }
    
    public void setActivities(List<BPELActivity> activities) {
        if (activities == null || activities.size() < 1) {
            throw new IllegalArgumentException(
                "A BPEL flow must contain at least one activity!");
        }
        for (Iterator<BPELActivity> iterator = activities.iterator(); iterator.hasNext(); ) {
            addActivity(iterator.next());
        }
    }
    
    private void addActivity(BPELActivity activity) {
        addNode(activity);
        new ConnectionImpl(
            split, Node.CONNECTION_DEFAULT_TYPE,
            activity, Node.CONNECTION_DEFAULT_TYPE);
        new ConnectionImpl(
            activity, Node.CONNECTION_DEFAULT_TYPE,
            join, Node.CONNECTION_DEFAULT_TYPE);
    }

    public void setLinks(String[] links) {
        this.links = links;
    }
    
    public String[] getLinks() {
        return links;
    }
    
    public SourceLink[] getSourceLinks() {
        return sourceLinks;
    }

    public void setSourceLinks(SourceLink[] sourceLinks) {
        this.sourceLinks = sourceLinks;
    }

    public TargetLink[] getTargetLinks() {
        return targetLinks;
    }

    public void setTargetLinks(TargetLink[] targetLinks) {
        this.targetLinks = targetLinks;
    }

}
