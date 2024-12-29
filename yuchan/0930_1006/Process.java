import java.util.*;
class Process {
    public int solution(int[] priorities, int location) {
        int answer = -1;
        int k = 0;
        Queue<Node>queue = new LinkedList<>();
        for(int i = 0; i<priorities.length; i++)
        {
            queue.offer(new Node(priorities[i],i));
        }
        Arrays.sort(priorities);
        for(int i = 0; i<priorities.length; i++)
        {
            for(int j = i+1; j<priorities.length; j++)
                {
                    if(priorities[i] < priorities[j])
                    {
                        int temp = 0;
                        temp = priorities[i];
                        priorities[i] = priorities[j];
                        priorities[j] = temp;
                    }
                }
        }
        answer = 1;
        while(!queue.isEmpty())
        {
            Node node = queue.poll();
            if(priorities[k] == node.prior)
            {
                if(location == node.target)
                {
                    System.out.println(answer);
                    return answer;
                }
                else
                {
                    answer++;
                    k++;
                    
                }
            }
            else
            {
                queue.offer(new Node(node.prior,node.target));
            }
        }
        
        
        
        return answer;
    }
}

class Node{
    int prior;
    int target;
    Node(int prior, int target)
    {
        this.prior = prior;
        this.target = target;
    }
}