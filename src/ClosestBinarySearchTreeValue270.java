public class ClosestBinarySearchTreeValue270 {
    public int closestValue(TreeNode root, double target) {
        int t = (int) Math.round(target);
        int result = find(root, t, Integer.MAX_VALUE, 0);
        return result;
    }
    public int find(TreeNode root, int target, int min, int val){
        if(root != null){
            if(root.val > target){
                // fo left
                if(min > Math.abs(root.val-target)){
                    min = Math.abs(root.val-target);
                    val = root.val;
                }
                System.out.println("min "+min);
                find(root.left, target, min, val);
            }else if(root.val < target){
                // go right
                if(min > Math.abs(root.val-target)){
                    min = Math.abs(root.val-target);
                    val = root.val;
                }
                System.out.println("min "+min);
                find(root.right, target, min, val);
            }else{
                // if value equal
                System.out.println("root.val "+root.val);
                min = 0;
                val = root.val;
                return root.val;

            }
        }

        return (val);
    }
}
