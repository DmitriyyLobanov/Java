package Task_seminar_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MFC_emulated {

    public static void main(String[] args) {

        List<Tasks> tasksList = new ArrayList<>();
        Tasks passport = new Passport();
        tasksList.add(passport);

        Tasks interPassport = new InternationalPassport();
        tasksList.add(interPassport);

        Tasks complexRequest = new ComplexRequest();
        tasksList.add(complexRequest);

        Tasks payment = new Payment();
        tasksList.add(payment);

        Tasks inn = new INN();
        tasksList.add(inn);

        Tasks snils = new SNILS();
        tasksList.add(snils);

        int[] taskPriorityValues = new int[tasksList.size()];
        for (int i = 0; i < taskPriorityValues.length; i++) {
            taskPriorityValues[i] = tasksList.get(i).prioritet();
        }
        System.out.println(Arrays.toString(taskPriorityValues));

        Queue<Tasks> queue = new LinkedList<>();
        for (int i = 0; i < taskPriorityValues.length; i++) {

            queue.add(tasksList.get(i));
        }
        System.out.println(queue);

        while (!queue.isEmpty()) {
            if (humanBehavior.humanPatience()) {
                System.out.printf("Задача: %s, приоритет задачи: %d .\n", queue.element().description(),
                        queue.element().prioritet());
                try {
                    if (WorkWindow.probabilityOfClosure()) {
                        Thread.sleep(WorkWindow.closedWindow());
                    }
                    Thread.sleep(queue.element().time());
                    queue.remove();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Терпение человека лопнуло и он ушел не дождавшись своей очереди.");
                System.out.println("Текущая задача удалена из очереди.");
                queue.remove();
            }
        }

    }
}
