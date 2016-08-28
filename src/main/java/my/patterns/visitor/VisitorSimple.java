package my.patterns.visitor;

interface Visitable {
    void accept(Visitor visitor);
}

class WorkingRoom implements Visitable {
    public int number;
    WorkingRoom(int number) {
        this.number = number;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class BossRoom implements Visitable {
    public String bossName;
    BossRoom(String bossName) {
        this.bossName = bossName;
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

interface Visitor{
    void visit(WorkingRoom workingRoom);
    void visit(BossRoom bossRoom);
    void visit(Office office);
}

class Office implements Visitable{
    public Visitable[] firstFloor;
    public Visitable[] secondFloor;
    public Visitable ceoRoom;
    public Office(){
        firstFloor = new Visitable[]{ new WorkingRoom(101),
                                        new WorkingRoom(102),
                                        new BossRoom("Jeff Atwood"),
                                        new WorkingRoom(103)};
        secondFloor = new Visitable[]{  new WorkingRoom(201),
                                        new WorkingRoom(202),
                                        new BossRoom("Joel Spolsky")};

        ceoRoom = new BossRoom("Bill Gates");
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void showMeTheOffice(Visitor visitor, boolean sayPlease) {
        // Office manager decides the order in which rooms are visited
        for(int i=secondFloor.length-1; i >= 0; i--){
            secondFloor[i].accept(visitor);
        }
        if (sayPlease){
            ceoRoom.accept(visitor);
        }
        for (int i = 0; i < firstFloor.length; i++) {
            firstFloor[i].accept(visitor);
        }
    }
}

class Insider implements Visitor{
    public void visit(WorkingRoom workingRoom) {
        System.out.println("I> This is working room #"+workingRoom.number);
    }

    public void visit(BossRoom bossRoom) {
        System.out.println("I> Hi, "+bossRoom.bossName);
    }

    public void visit(Office office) {
        // I know about office structure, so I'll just go to the 1st floor
        for(int i=0;i<office.firstFloor.length;i++){
            office.firstFloor[i].accept(this);
        }
    }
}

class Outsider implements Visitor{

    public void visit(Office office) {
        // I do not know about office structure, but I know they have a 
        // nice office manager
        // I'll just ask to show me the office
        office.showMeTheOffice(this, true);
    }

    public void visit(WorkingRoom workingRoom) {
        System.out.println("O> Wow, room #"+workingRoom.number);
    }

    public void visit(BossRoom bossRoom) {
        System.out.println("O> Oh, look, this is "+bossRoom.bossName);
    }
}

public class VisitorSimple{
    public static void main(String[] args) {
        Office office = new Office(); // visited structure
        // visitor who knows about office structure
        Insider employee = new Insider(); 
        office.accept(employee);
        System.out.println();
        // visitor who does not know about exact office structure
        // but knows something else
        Outsider candidate = new Outsider(); 
        office.accept(candidate);

        // no enumeration at all, but still a visitor pattern
        Visitable v = new BossRoom("Linus Torvalds");
        v.accept(candidate);
    }
}