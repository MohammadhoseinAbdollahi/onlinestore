public class Node2
{



        private Item s;
        private Node2 next;

        public Node2(Item s, Node2 next)
        {
            this.s = s;
            this.next = next;
        }

        public Item getS()
        {
            return s;
        }

        public void setS(Item s)
        {
            this.s = s;
        }

        public Node2 getNext()
        {
            return next;
        }

        public void setNext(Node2 next)
        {
            this.next = next;
        }



    }


