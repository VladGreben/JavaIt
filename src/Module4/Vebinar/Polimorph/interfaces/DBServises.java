package Module4.Vebinar.Polimorph.interfaces;

import Module4.Vebinar.Polimorph.abstraction.DeveloperEployee;

public interface DBServises {
    //void test();
     //void method(int a,int b , String name);
    void save(DeveloperEployee eployee);

    DeveloperEployee get(long id);
    void update(DeveloperEployee eployee);
    DeveloperEployee[] getAllDevelopers();


}
