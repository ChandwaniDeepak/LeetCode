import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AreBloodRelated {
    Set<Person> set = new HashSet();

    class Person{
        Person father;
        Person mother;
        String name;
        List<Person> children;

        public Person getFather() {
            return father;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public Person getMother() {
            return mother;
        }

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Person> getChildren() {
            return children;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }
    }


    public void prepareTree(){
        Person a = new Person();
        Person b = new Person();

        Person c = new Person();
        c.setFather(a);
        c.setMother(b);

        Person d = new Person();
        d.setFather(a);
        d.setMother(b);

        Person e = new Person();
        e.setFather(a);
        e.setMother(b);

        Person f = new Person();
        f.setFather(a);
        f.setMother(b);

        List<Person> ab = new ArrayList();
        ab.add(c);
        ab.add(d);
        ab.add(e);
        ab.add(f);

        a.setChildren(ab);
        b.setChildren(ab);

        Person x = new Person();
        Person y = new Person();

        Person u = new Person();
        u.setFather(x);
        u.setMother(y);

        Person v = new Person();
        v.setFather(x);
        v.setMother(y);

        Person w = new Person();
        w.setFather(x);
        w.setMother(y);

        List<Person> xy = new ArrayList();
        xy.add(u);
        xy.add(v);
        xy.add(w);

        x.setChildren(xy);
        y.setChildren(xy);


        Person one = new Person();
        one.setFather(f);
        one.setMother(u);

        Person two = new Person();
        two.setFather(f);
        two.setMother(u);

        Person three = new Person();
        three.setFather(f);
        three.setMother(u);

        List<Person> fu = new ArrayList();
        fu.add(one);
        fu.add(two);
        fu.add(three);

        f.setChildren(fu);
        u.setChildren(fu);



        Person four = new Person();
        Person five = new Person();
        Person six = new Person();
        Person seven = new Person();
        Person eight = new Person();
        Person nine = new Person();
        Person ten = new Person();
        Person eleven = new Person();

        System.out.println(areBloodRelated(c, three));
        set.clear();
        System.out.println(areBloodRelated(c, eleven));
    }

    public boolean areBloodRelated(Person p1, Person p2){
        return areAncestorsSame(p1) || areAncestorsSame(p2);
    }

    public boolean areAncestorsSame(Person p){
        if(p == null){
            return false;
        }

        if(set.contains(p)){
            return true;
        }
        set.add(p);
        return areAncestorsSame(p.father) || areAncestorsSame(p.mother);
    }

}
