/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node>queue=new LinkedList<Node>();
        List<List<Integer>>main=new LinkedList<List<Integer>>();
        if(root==null){
            return main;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int s=queue.size();
            List<Integer>list=new LinkedList<Integer>();
            for(int i=0;i<s;i++){
                Node current=queue.poll();
                list.add(current.val);
                if(current.children!=null){
                    for(Node child:current.children){
                    queue.offer(child);
                    }
                }
            }
            main.add(list);
        }
        return main;
        
    }
}