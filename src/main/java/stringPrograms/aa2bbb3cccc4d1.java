package stringPrograms;

public class aa2bbb3cccc4d1 {
        public static void main(String[] args) {
            String s="aabbbcceeee";
            StringBuilder st=new StringBuilder();
            int count=1;
            for(int i=0;i<s.length();i++){
                if((i+1<s.length()) && (s.charAt(i)==s.charAt(i+1))){
                    count++;
                }
                else{
                    for(int j=0;j<count;j++){
                        st.append(s.charAt(i));
                    }
                    st.append(count);
                    count=1;
                }
                
            }

            System.out.println(st);
        }
    }

//for reverting