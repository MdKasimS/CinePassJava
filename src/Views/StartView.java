package Views;
import Classes.Console;
import Interfaces.IView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class StartView implements IView {
    private int _choice = 0;
    private List<String> _menuList;

    public void setMenuList()
    {
        _menuList = List.of(
                "1. Login ",
                "2. Register ",
                "3. Forgot Password ",
                "4. Create View And ViewModel Files",
                "5. Exit"
        );

    }

    public List<String> getMenuList()
    {
        //Note this. It is very important to get Menulist of this instance else we will get null
        return StartView.getInstance()._menuList;
    }

//        These Choice and MenuList is the way of writing getter and setter in C#. We need to change it to java specific getter and setter
//        public int Choice { get => _choice; set => _choice = value; }
//        public List<string> MenuList
//        {
//            get;
//            set;
//        }

    private static StartView _instance;

    //This is Singleton Patten. We need to create generic class for this
    public static StartView getInstance()
    {
        if(_instance==null)
        {
            _instance = new StartView();
        }
        return _instance;
    }

    public void LoadMenuList() {
        StartView.getInstance().setMenuList();
    }

    public void View()
    {
        StartView.getInstance().LoadMenuList();

        do//main loop
        {
            Console.Clear();
            Console.WriteLine("\t----- !!! Salam Hindusthan !!! -----");
            Console.WriteLine("================================================");

            Console.WriteLine("\nStart - CineComplex");
            Console.WriteLine("-------------------------------------------------");

            Console.WriteLine();

            Console.WriteLine("\nMenu : ");
            Console.WriteLine("---------------");

            for (String menuItem : _menuList) {
                Console.WriteLine(menuItem);
            }

            Console.Write("Enter Your Choice : ");


//                int.TryParse(Console.ReadLine(), out _choice);
            _choice = Console.ReadLine();
            switch (_choice)
            {
                case 1:
                    //:Todo @Sahil you have to create all these by yourself
//                        HomeView.Instance.View();
                    break;

                case 2:
                    //:Todo @Sahil you have to create all these by yourself
//                        ForgotPasswordFormView.Instance.View();
                    break;

                default:
                    Console.WriteLine("Please enter the valid Choice .....");
                    break;
            }
        } while (_choice != StartView.getInstance().getMenuList().size());
    }

    @Override
    public int getChoice() {
        return _choice;
    }

    @Override
    public void setChoice() {
        _choice = Console.ReadLine();
    }
}
