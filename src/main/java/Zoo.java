import animals.*;
import employee.Worker;
import food.Food;
import food.Grass;
import food.Meat;

public class Zoo {


    public static void main(String[] args) {

        //Животные
        Animal a1 = new Carnivorous();
        Animal a2 = new Herbivore();
        Food f1 = new Meat();
        Food f2 = new Grass();
        Dog dog = new Dog();
        Duck duck = new Duck();
        Fish fish = new Fish();
        Kotik kotik = new Kotik();
        Nosorog nosorog = new Nosorog();
        Vorobey vorobey = new Vorobey();
        //ЕДА
        Grass grass = new Grass();
        Meat meat = new Meat();
        //Рабочий
        Carnivorous c = new Carnivorous();
        Worker worker = new Worker();
        worker.feed(dog, f2);
        worker.feed(dog, f1);
        worker.feed(vorobey, f1);
        worker.feed(vorobey, f2);
        worker.getVoice(dog);
        worker.getVoice(kotik);
        worker.getVoice(nosorog);
        worker.getVoice(vorobey);

        createPond();

    }

    // В методе main в цикле вызвать метод swim()
    //  у каждого животного из массива, созданного через createPond().

    public static Swim[] createPond(){
        Swim [] swims = new Swim[2];
        swims[0]=new Fish();
        swims[0].swim();
        swims[1]=new Duck();
        swims[1].swim();
        return swims;
    }
    // public static List<Swim> createPond(){
    //     List<Swim>swimList=new ArrayList<Swim>();
    //     swimList.add(new Fish());
    //     swimList.add(new Duck());
    //     return swimList;
    //  }
}

