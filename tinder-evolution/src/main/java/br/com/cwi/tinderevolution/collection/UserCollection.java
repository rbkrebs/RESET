package br.com.cwi.tinderevolution.collection;

import br.com.cwi.tinderevolution.domain.Users;

import java.util.ArrayList;
import java.util.List;

public class UserCollection {

    private static int counter = 1;
    private static final List<Users> listUsers = new ArrayList<>();


    public Users save(Users user) {
        user.setId(counter++);
        listUsers.add(user);
        return user;
    }


    public List<Users> listAll() {
        return listUsers;
    }


    public Users findById(int id) {

        return this.listUsers.stream().filter(user-> user.getId() == id).findFirst().get();

    }


    public boolean delete(int id) {
        return false;
    }


    public Users update(int id, Users newUsers){


        Users user = findById(id);
        user.setBio(newUsers.getBio());
        user.setDateOfBirth(newUsers.getDateOfBirth());
        user.setEmail(newUsers.getEmail());
        user.setLocalizacao(newUsers.getLocalizacao());
        user.setName(newUsers.getName());
        user.setPhone(newUsers.getPhone());
        return user;
    }
}
