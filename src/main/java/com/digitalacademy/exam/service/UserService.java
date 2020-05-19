package com.digitalacademy.exam.service;

import com.digitalacademy.exam.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUserInfoById(Long id) throws Exception {
        User user = new User();

        if(id.equals(7L)){
            user.setId(7L);
            user.setUsername("soizensun");
            user.setFirstName("Kitpavin");
            user.setLastName("Chaiwong");
            user.setAge(22);
            user.setTelephone("0845554587");
            user.setGraduatedForm("KU");
            user.setGrade("3.01");
            user.setMajor("com sci");
            user.setJob("SCB");
            return user;
        }
        else if(id.equals(1L)){
            User user1 = new User();
            user1.setId(1L);
            user1.setUsername(null);
            user1.setFirstName(null);
            user1.setLastName(null);
            user1.setAge(null);
            user1.setTelephone(null);
            user1.setGraduatedForm(null);
            user1.setGrade(null);
            user1.setMajor(null);
            user1.setJob(null);
            return user1;
        }
        else{
            throw new Exception("bad Request");
        }

    }
}
