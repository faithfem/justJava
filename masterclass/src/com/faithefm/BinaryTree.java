/*package com.faithefm;

public class BinaryTree {

    Node root;
    public void addNode(int key, String name){
        Node newNode = new Node(key, name);

        if(root == null){
            root = newNode;
        } else{
            Node focusNode = root;
            Node parent;
            while(true){
                parent = focusNode; //focus node is the root
                if(key < focusNode.key){
                    focusNode = focusNode.leftChild;
                    parent.leftChild = newNode;
                    return;
                }
            } /*else{
                focusNode = focusNode.rightChild;
                if (focusNode == null) {
                    parent.rightChild = newNode;
                    return;
                }
            }
        }
    }

    public static void main(string[]args){

    }
}

class Node{

    //create class
    int key;
    String name;

    Node leftChild;
    Node rightChild;

    //CREATE CONSTRUCTOR
    Node (int key, String name){
        this.key = key;
        this.name = name;
    }

    public String toString(){
        return name + "has a key " + key;
    }
}*/
