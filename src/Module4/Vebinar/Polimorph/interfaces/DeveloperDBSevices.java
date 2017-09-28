package Module4.Vebinar.Polimorph.interfaces;

import Module4.Vebinar.Polimorph.abstraction.DeveloperEployee;

public class DeveloperDBSevices  implements DBServises{
    @Override
    public void save(DeveloperEployee eployee) {

    }

    @Override
    public DeveloperEployee get(long id) {
        return null;
    }

    @Override
    public void update(DeveloperEployee eployee) {

    }

    @Override
    public DeveloperEployee[] getAllDevelopers() {
        return new DeveloperEployee[0];
    }
}
