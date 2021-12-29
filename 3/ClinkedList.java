public class ClinkedList{
    Node last;
    static class Node{
        int data;
        Node next;
    }
    public Node addToEmpty(int data){
        if(this.last != null)
        return this.last;

        Node temp=new Node();
        temp.data=data;
        this.last=temp;
        this.last.next=this.last;
        return last;
    }
    public Node addBegin(int data){
        if(last==null)
        return addToEmpty(data);
        Node temp=new Node();
        temp.data=data;
        temp.next=this.last.next;
        this.last.next=temp;
        return this.last;
    }
    public void traverse(){
        Node p;
        if (this.last==null){
            System.out.println("List is empty.");
            return;
        }
        p=this.last.next;
        do{
            System.out.print(p.data+" ");
            p=p.next;
        }while(p !=this.last.next);
        System.out.println(" ");
    }
    public int length(){
        int x=0;
        if(this.last==null)
        return x;

        Node itr=this.last.next;
        while(itr.next != this.last.next){
            x++;
            itr=itr.next;
        }
        return (x+1);
    }
    public Node split(int k){
        Node pass=new Node();
        if(this.last==null)
        return this.last;
        Node newLast, itr=this.last;
        for(int i=0;i<k;i++){
            itr=itr.next;
        }
        newLast=itr;
        pass.next=itr.next;
        newLast.next=this.last.next;
        this.last.next=pass.next;
        return newLast;
    }
    public static void main(String[] args) {
        ClinkedList clist=new ClinkedList();
        clist.last=null;
        clist.addToEmpty(12);
        clist.addBegin(10);
        clist.addBegin(8);
        clist.addBegin(6);
        clist.addBegin(4);
        clist.addBegin(2);
        System.out.println("Original list:");
        clist.traverse();
        int k=3;
        ClinkedList clist2=new ClinkedList();
        clist2.last=clist.split(k);
        System.out.println("The new lists are:");
        clist2.traverse();
        clist.traverse();
    }
}