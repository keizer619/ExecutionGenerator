package org.wso2.carbon.eventprocessing.executiongenerator.internal.processing;

/**
 * ConditionNode class is used to track wiring of conditions with AND and OR
 * keeps the current processed condition of a node,type of the node(AND/OR/Parameter),and whether
 * the node is left or right child
 */
public class ConditionNode {

    private String currentCondition;
    private String type;
    private ConditionNode parent;
    private ConditionNode left;
    private ConditionNode right;
    private String order;

    /**
     * get condition node type
     *
     * @return condition node type
     */
    public String getType() {
        return this.type;
    }

    /**
     * get position of the condition node (left or right)
     *
     * @return left or right
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * get current condition
     *
     * @return current condition
     */
    public String getCurrentCondition() {
        return this.currentCondition;
    }

    /**
     * get parent condition node
     *
     * @return parent node
     */
    public ConditionNode getParent() {
        return this.parent;
    }

    /**
     * get left child
     *
     * @return left condition node
     */
    public ConditionNode getLeft() {
        return this.left;
    }

    /**
     * get right child
     *
     * @return right condition node
     */
    public ConditionNode getRight() {
        return this.right;
    }

    /**
     * set operation type
     *
     * @param operationType operation type
     */
    public void setType(String operationType) {
        this.type = operationType;
    }

    /**
     * set parent node
     *
     * @param node parent condition node
     */
    public void setParent(ConditionNode node) {
        this.parent = node;
    }

    /**
     * set left child
     *
     * @param node left condition node
     */
    public void setLeft(ConditionNode node) {
        this.left = node;
    }

    /**
     * set right child
     *
     * @param node right condition node
     */
    public void setRight(ConditionNode node) {
        this.right = node;
    }

    /**
     * position of the condition node (left or right)
     *
     * @param order left or right
     */
    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * set condition
     *
     * @param condition condition
     */
    public void setCondition(String condition) {
        this.currentCondition = condition;
    }
}