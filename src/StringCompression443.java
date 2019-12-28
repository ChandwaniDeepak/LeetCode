public class StringCompression443 {

    public int compress(char[] c) {
        if(c == null || c.length == 0){
            return 0;
        }
        int left = 0, writeAt = 1;
        int count = 1;
        for(int right = 1; right < c.length; right++){

            if(c[left] == c[right]){
                count+=1;
                if(right == c.length - 1){
                    for(char countChar: String.valueOf(count).toCharArray()){
                        c[writeAt] = countChar;
                        writeAt+=1;
                    }
                }
            }else{

                if(count ==1){
                    c[writeAt] = c[right];
                    left = right;
                    writeAt+=1;
                    continue;
                }else{
                    System.out.println("C[left] = "+c[left]+"  --  count "+count);
                    for(char countChar: String.valueOf(count).toCharArray()){
                        c[writeAt] = countChar;
                        writeAt+=1;
                    }
                    c[writeAt] = c[right];
                    writeAt+=1;
                    left = right;
                    count = 1;
                }

            }

        }
        //System.out.println(c.toString());
        return writeAt;
    }

}
