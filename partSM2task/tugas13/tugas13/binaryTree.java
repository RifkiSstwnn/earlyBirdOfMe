package tugas13;

public class binaryTree {
   node root;
   int size;

   binaryTree() {
       root = null;
   }

   boolean isEmpty() {
       return root == null;
   }

   void add(int data) {
       if (isEmpty()) {
           root = new node(data);
       } else {
           node current = root;
           while (true) {
               if (data < current.data) {
                   if (current.left != null) {
                       current = current.left;
                   } else {
                       current.left = new node(data);
                       break;
                   }
               } else if (data > current.data) {
                   if (current.right != null) {
                       current = current.right;
                   } else {
                       current.right = new node(data);
                       break;
                   }
               } else {
                   break;
               }
           }
       }
   }

   boolean find(int data) {
       boolean hasil = false;
       node current = root;
       while (current != null) {
           if (current.data == data) {
               hasil = true;
               break;
           } else if (data < current.data) {
               current = current.left;
           } else {
               current = current.right;
           }
       }
       return hasil;
   }

   void traversePreOrder(node node) {
       if (node != null) {
           System.out.print(" " + node.data);
           traversePreOrder(node.left);
           traversePreOrder(node.right);
       }
   }

   void traversePostOrder(node node) {
       if (node != null) {
           traversePostOrder(node.left);
           traversePostOrder(node.right);
           System.out.print(" " + node.data);
       }
   }

   void traverseInOrder(node node) {
       if (node != null) {
           traverseInOrder(node.left);
           System.out.print(" " + node.data);
           traverseInOrder(node.right);
       }
   }

   node getSuccessor(node del) {
       node successor = del.right;
       node successorParent = del;
       while (successor.left != null) {
           successorParent = successor;
           successor = successor.left;
       }
       if (successor != del.right) {
           successorParent.left = successor.right;
           successor.right = del.right;
       }
       return successor;
   }

   void delete(int data) {
       if (isEmpty()) {
           System.out.println("Tree is empty!");
           return;
       }
       //
       node parent = root;
       node current = root;
       boolean isLeftChild = false;
       while (current != null) {
           if (current.data == data) {
               break;
           } else if (data < current.data) {
               parent = current;
               current = current.left;
               isLeftChild = true;
           } else if (data > current.data) {
               parent = current;
               current = current.right;
               isLeftChild = false;
           }
       }
       if (current == null) {
           System.out.println("Couldn't find data!");
           return;
       } else {
           if (current.left == null && current.right == null) {
               if (current == root) {
                   root = null;
               } else {
                   if (isLeftChild) {
                       parent.left = null;
                   } else {
                       parent.right = null;
                   }
               }
           } else if (current.left == null) {
               if (current == root) {
                   root = current.right;
               } else {
                   if (isLeftChild) {
                       parent.left = current.right;
                   } else {
                       parent.right = current.right;
                   }
               }
           } else if (current.right == null) {
               if (current == root) {
                   root = current.left;
               } else {
                   if (isLeftChild) {
                       parent.left = current.left;
                   } else {
                       parent.right = current.left;
                   }
               }
           } else {
               node successor = getSuccessor(current);
               if (current == root) {
                   root = successor;
               } else {
                   if (isLeftChild) {
                       parent.left = successor;
                   } else {
                       parent.right = successor;
                   }
                   successor.left = current.left;
               }
            }
       }
   }

   void rekursif(node node, int data) {
    if (isEmpty()) {
        root = new node(data);
    } else {       
        if (data < node.data) {
            if (node.left != null) {
                rekursif(node.left, data);                
            }else {
                node.left = new node(data);                    
            }
        } else if (data > node.data) {
            if (node.right != null) {
                rekursif(node.right, data);
            } else {
                node.right = new node(data);               
            }
        } else {
                
        }    
    }
  }

  int min (node node){
    if (isEmpty()){
        System.out.println("Nilai Node Masih Kosong");
    } else {
        if(node.left!=null){
         return min(node.left);
        }
    }
    return node.data;
  }

  int max (node node){
    node current = root;
    if (isEmpty()){
        System.out.println("Nilai Node Masih Kosong");
    } else {
        while(current.right!=null){
         current=current.right;
        }
    }
    return current.data;
  }

  void leaf(node node){
    if(isEmpty()){
        System.out.println("Tree masih kosong");
    } else if(node.left!=null&&node.right!=null){
        leaf(node.left);
        leaf(node.right);   
    }else if(node.left==null&&node.right!=null){
        leaf(node.right);  
    }else if(node.left!=null&&node.right==null){
        leaf(node.left);
    } else{
        jumlahLeaf();
        System.out.print(node.data+" ");
    }
  }
  int jumlahLeaf(){
    return size++;
  }
}