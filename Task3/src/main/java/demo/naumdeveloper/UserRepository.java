package demo.naumdeveloper;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Component
public class UserRepository {
     private List<User>users;

     public UserRepository() {
        this.users = new ArrayList<>();
        users.add(new User(1L, "Name", 32));
    }

    public Optional<User> find(Long id){
        return users.stream().filter(s->s.getId().equals(id)).findFirst();
    }

    public Stream<User> findAge(int age){
        return users.stream().filter(s->s.getAge()==age);
    }

    public Optional<User> findName(String name){
        return users.stream().filter(c -> c.getName().equals(name)).findFirst();
    }
    
}
