// Name: Willie McCaleb
//        Current Date: 03/25/21
//        Sources Consulted: Youtube, Stack Overflow, Muhammad Javed
//        By submitting this work, I attest that it is my original work and that I did
//        not violate the University of Mississippi academic policies set forth in the
//        M book.


import java.util.Scanner;

public class Animals {

    public static Node root;
    public static void main(String args[])
    {
        //call the createTree() function to create the tree
        createTree();
        Scanner sc=new Scanner(System.in);
        //Display the animal names and start the questions
        System.out.println();
        System.out.println("From the animal list, can you choose a animal? ");
        System.out.println();
        System.out.println("Animal List: Bass, Buzzard, Cane Toad, Goldfish, Guppy, Rabbit, Seahorse, Seals, Tarpon, or Woodpecker.");
        System.out.println();
        System.out.println("Do not tell me your animal!! \nI will use my big brian to guess!");
        System.out.println();
        System.out.println("Answer the following questions with a Yes or No answer");
        System.out.println("Ready BEGIN!!");
        System.out.println();
        Node temproot=root;
        //loop continuously
        while(true)
        {
            //if the left child is not null then this is a question
            if(temproot.left!=null)
                System.out.print(temproot.data);
            else //if the left child is null then this is the answer

                System.out.println("Using my big brain, I predict your animal is a "+temproot.data);
            if(temproot.left!=null) //if the left child is not null then the answer is not yet displayed
            {
                //ask for user input
                String data=sc.nextLine();
                if(data.equals("yes"))
                    temproot=temproot.right;
                else
                    temproot=temproot.left;

            }
            else //if the left child is null then the answer is displayed and the round is complete
            {
                //ask if user wants to play another round
                System.out.println();
                System.out.print("Would you like to play another round? ");
                System.out.println("Yes or No");
                //input the response of the user
                String data=sc.nextLine();
                if(data.equals("yes"))
                {
                    System.out.println("Choose an animal: Bass, Buzzard, Cane Toad, Goldfish, Guppy, Rabbit, Seahorse, Seals, Tarpon, or Woodpecker .");
                    System.out.println();
                    temproot=root;
                }
                else
                    break;
            }
        }
        temproot=root;

        System.out.println("Preorder traversal of the tree:");
        //call the preorder() function to display the preorder traversal
        preorder(temproot);
    }
    public static void createTree()
    {
        //create the tree
        root=new Node("Does it live in land? ");
        root.left=new Node("Is it a mammal? ");
        root.left.left=new Node("Does the male carry the eggs? ");
        root.left.right=new Node("Seal");
        root.left.left.left=new Node("Are they colorful? ");
        root.left.left.right=new Node("Seahorse");
        root.left.left.left.left=new Node("Is it called a small-mouth ,big-mouth, or spotted within their species name? ");
        root.left.left.left.right=new Node("Are they peaceful? ");
        root.left.left.left.right.left=new Node("Guppy");
        root.left.left.left.right.right=new Node("Goldfish");
        root.left.left.left.left.left=new Node("Tarpon");
        root.left.left.left.left.right=new Node("Bass");
        root.right=new Node("Can it fly? ");
        root.right.left=new Node("Is it poisonous to eat? ");
        root.right.left.left=new Node("Rabbit ");
        root.right.left.right=new Node("Cane Toad");
        root.right.right=new Node("Do it eat roadkill? ");
        root.right.right.left=new Node("woodpecker");
        root.right.right.right=new Node("Buzzard");
    }
    public static void preorder(Node node)
    {
        if(node==null)
            return;
        System.out.println(node.data); //display the data
        preorder(node.left); //move to left child first
        preorder(node.right); //then move to right child
    }
}

