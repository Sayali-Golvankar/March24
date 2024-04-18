class Room {
  
   float height;
   float breath;
   float width;
   float volume;
public static void main (String atg[]){
Room r= new Room();
float a=r.volume ();
   System.out.println(a);
  } 
float volume(){
   volume = height*width*breath;
return volume;
      
}
}