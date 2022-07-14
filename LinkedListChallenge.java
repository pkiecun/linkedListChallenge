public class LinkedListChallenge {

    private Body body;

    static class Body {


    private int data;
    private Body tail;

    public Body(){
    }
    public Body(int data){
        this.data = data;
        this.tail = null;
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


}
