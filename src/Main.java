import Classes.Console;
import Interfaces.IView;
import Views.StartView;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        int _choice;

        List<String> menuList = List.of(
                "1. Start View",
                "2. Home View",
                "3. Manage Ticket View",
                "4. SignUp View",
                "5. User Home View",
                "6. User Management View",
                "7. Account View",
                "8. Forgot Password View",
                "9. Exit",
                "10. Admin Home View"
        );

        do{
            Console.Clear();
            Console.WriteLine("\t----- !!! Salam Hindusthan !!! -----");
            Console.WriteLine("================================================");

            for (String menuItem : menuList) {
                Console.WriteLine(menuItem);
            }

            Console.Write("Enter Your Choice : ");

//            int.TryParse(Console.ReadLine(), out choice);

            //Fundamentals of OOP. For ll views type should be same so interface named IView is created.
            IView app = (IView) StartView.getInstance();

            _choice = Console.ReadLine();
            switch (_choice){

                case 1:
                    //Start View
//                    app.View();
                    break;

                case 2:
                    //Home View
//                    app = SignInView.Instance;
//                    app.View();
                    Console.WriteLine("SignIn View");
                    break;

                case 3:
                    //ManageTicket View
//                    app = ManageTicketsView.Instance;
//                    app.View();
                    Console.WriteLine("Admin ManageTickets View");
                    break;

                case 4:
                    //SignUp View
//                    app = SignUpFormView.Instance;
//                    app.View();
                    Console.WriteLine("SignUp View");
                    break;

                case 5:
                    //User Home View
//                    app = UserHomeView.Instance;
//                    app.View();
                    Console.WriteLine("User HomeView View");
                    break;

                case 6:
                    //User Management View
//                    app = UserManagementView.Instance;
//                    app.View();
                    Console.WriteLine("UserManagementView View");
                    break;

                case 7:
                    //Profile View
//                    app = AccountView.Instance;
//                    app.View();
                    Console.WriteLine("AccountView View");
                    break;

                case 8:
                    //ForgotPassowrd View
//                    app = ForgotPasswordFormView.Instance;
//                    app.View();
                    Console.WriteLine("AccountView View");
                    break;

                case 9:
                    //Keep this empty for easy testing purposes
                    break;

                case 10:
//                    app = AdminHomeView.Instance;
//                    app.View();
                    Console.WriteLine("AccountView View");
                    break;

                default:
                    Console.WriteLine("Ok");
                    break;
            }
        } while (_choice != 9);
    }
}
