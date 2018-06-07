package org.JakeBarron.Cirtual.managers;


import org.JakeBarron.Cirtual.domains.User;

import java.util.List;

public interface UserManager {
    public List<User> getAllUsers();

    public User getUserByUserName(String userName);
    
    public User registerUser(User userName);
}
