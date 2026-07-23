class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> al = new ArrayList<>();
  
        for(int i=0;i<numRows;i++){
            long res=1;
            ArrayList<Integer>al1=new ArrayList<>();
            al1.add(1);
            for(int j=0;j<i;j++){
                res=res*(i-j);
                res=res/(j+1);
                al1.add((int)res);
            }
            al.add(al1);
        }
        return al;
    }
}