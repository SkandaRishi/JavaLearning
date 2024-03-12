public class O5Strings {
    public static void main(String args[]){
        // Strings
        // Concatenate 
        String name1 = "Rishi";
        String name2 = "Sona";
        String name3 = name1 + " and " + name2;
        System.out.println(name3);

        // CharAt 
        System.out.println(name2.charAt(3));
        
        // Length
        System.out.println(name2.length());

        // Replace
        String name = name1.replace('i', 'o'); // Replace 'i' with 'o' in name1
        System.out.println(name);
        //Substring
        System.out.println(name.substring(1,5));
    }
}
