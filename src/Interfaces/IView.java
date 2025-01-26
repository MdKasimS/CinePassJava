package Interfaces;

import java.util.List;

public interface IView
    {
        public void View();
//        public int Choice { get; set; }

        public int getChoice();
        public void setChoice();

//        public List<string> MenuList { get; set; }
        public List<String> getMenuList();
        public void setMenuList();
        public void LoadMenuList();
    }
