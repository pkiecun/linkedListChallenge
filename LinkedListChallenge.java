import java.util.HashSet;
import java.util.Set;

public class LinkedListChallenge {

    private Body body;

     class Body {


    private int data;
    private Body tail;

    public Body(){
    }
    public Body(int data){
        this.data = data;
        this.tail = null;
    }
    public Body getTail(){
        return this.tail;
    }

    public void setTail(Body tail){
        this.tail = tail;
    }

    public String toString(){
        return "Position " + this.data + ".";
    }

    }

    public LinkedListChallenge(){}

    public LinkedListChallenge(int data){
        this.body = new Body(data);
    }


    public LinkedListChallenge addTo(LinkedListChallenge list, int addition){
        Body node = new Body(addition);

        if(list.body == null){
            list.body = node;
        }else{
            Body alter = list.body;
            while(alter.tail != null){
                alter = alter.tail;
            }
            alter.tail = node;
        }

        return list;
    }

    public Body checkLoop(LinkedListChallenge list){
        if(list.body == null){
            return null;
        }else {
            Set<Body> suit = new HashSet<>();
            Body ticket = list.body;
            while (ticket.tail != null){
                if(suit.add(ticket)){
                    ticket = ticket.tail;
                }else{
                    return ticket;
                }
            }
                return null;
        }
    }

    public Body duplicateCheck(LinkedListChallenge first, LinkedListChallenge second){
        if(first.body == null | second.body == null){
            return null;
        }else{
            Body ticket = first.body;
            Body pass = second.body;
            while(ticket.tail != null){
                while(pass.tail != null){
                    if(ticket == pass){
                        return ticket;
                    }else{
                        pass = pass.tail;
                    }
                }
                ticket = ticket.tail;
                pass = second.body;
            }
            return null;
        }
    }

    public Body getBody(){
         return this.body;
    }

    public void setBody(Body body){
         this.body = body;
    }

}
