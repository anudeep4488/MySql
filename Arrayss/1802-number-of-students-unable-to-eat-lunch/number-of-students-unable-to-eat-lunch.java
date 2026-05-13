import java.util.Queue;
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();

        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0;i<students.length;i++){
            q.add(students[i]);

        }
        for(int i = sandwiches.length - 1; i>= 0; i--) {
            st.push(sandwiches[i]);
        }

        int len = q.size();
        int count = 0;

        while(len!=0 && count<=len){
            if(q.peek()==st.peek()){
                q.poll();
                st.pop();
                len--;
                count =0;
            }
            else{
                q.offer(q.poll());
                count++;
            }
        }       
        return len;
    }
}