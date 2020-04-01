package br.com.cwi.tinderevolution.gerenciamento;

import br.com.cwi.tinderevolution.collection.UserCollection;
import br.com.cwi.tinderevolution.domain.Users;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

public class GerenciamentoUsuario {

    UserCollection userCollection = new UserCollection();

    public Users save(Users user) throws IllegalArgumentException {

        if (verificaRegistroDuplicado(user) && verificaMaioridade(user)) {

            return this.userCollection.save(user);
        }

        return null;

    }

    public boolean verificaRegistroDuplicado(Users userParam) {
        Optional<Users> user;
        try {

            user = Optional.of(this.userCollection.findByEmail(userParam.getEmail()));

        } catch (Exception e) {
            System.out.println(e);
            return true;
        }
        if (user.isPresent()) {

            throw new IllegalArgumentException("Música já cadastrada");
        }

        return true;

    }

    public boolean verificaMaioridade(Users userParam) {

        if (Period.between(userParam.getDateOfBirth(), LocalDate.now()).getYears()>18) {
            return true;
        }

        throw new IllegalArgumentException("Cadastro permitido apenas para usuários maiores de 18 anos");

    }


}
