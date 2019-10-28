package service;  
  
import dao.model.User;  
  
public interface IUserService {  
    public User getUserById(int userId);  
}  