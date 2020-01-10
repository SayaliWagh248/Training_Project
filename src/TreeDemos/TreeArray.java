package TreeDemos;

class TreeImpl
{
    static int root=0;
    static String str[]=new String[15];

    public void setRoot(String key)
    {
        str[0]=key;
    }

    public void setLeftChild(String key,int root)
    {
        int t=(root * 2)+1;

        if(str[root]==null)
        {
            System.out.println("There is no root element present!");

        }

        else
        {
            str[t]=key;
        }
    }

    public void setRightChild(String key,int root)
    {
        int t=(root * 2)+2;
        if(str[root]==null)
        {
            System.out.println("There is no root element present");
        }
        else
        {
            str[t]=key;
        }

    }

    public void printTree()
    {
        for(int i=0;i<15;i++)
        {
            if(str[i]!=null)
            System.out.print(str[i]);

            else
                System.out.print("___");
        }
    }
}

public class TreeArray {
public static void main(String[] args)
    {
        TreeImpl treeImpl=new TreeImpl();
        treeImpl.setRoot("A");

        treeImpl.setLeftChild("B",0);

        treeImpl.setRightChild("C",0);

        treeImpl.setLeftChild("D",1);

        treeImpl.setRightChild("E",2);

        treeImpl.setLeftChild("F",2);

        treeImpl.setRightChild("G",1);

        treeImpl.printTree();
    }
}
