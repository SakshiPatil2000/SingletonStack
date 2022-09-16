import static java.lang.System.exit;

public class Stack {
    private int top;
    private  int[] arr;
    private  int arrsize;

    /* Creating constructor of the class */

    public Stack(int size) {

        arr = new int[size];
        arrsize = size;
        top = -1;

    }


    // Code to push the elements to the array


    public  void push(int x)
    {
        if(isFull())
        {
            System.out.println("Stack is full");
            exit(-1);
        }

        System.out.println("Pushing : " +x);
        arr[++top] = x;
    }



    // Code to pop the element from array

    public void pop()
    {
        if (isEmpty())
        {
            System.out.println("Stack is Empty");
            exit(-1);

        }

        System.out.println("Removing : " +arr[top--]);
    }


    // Code to display the array

    public void display()
    {
        if(!isEmpty())
        {
            for(int i =0; i<=top ; i++)
            {
                System.out.println( arr[i]);
            }
        }
        else
        {
            exit(-1);
        }


    }


    // Code to return the size of the stack
    public int size()
    {
        return top + 1;
    }

    // Code to check if the stack is empty or not

    public boolean isEmpty()
    {
        return top == -1;
    }


    // Code to check if the stack is full or not
    public boolean isFull()
    {
        return top == arrsize - 1;
    }



}
