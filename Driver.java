public class Driver {

    public static void main(String args[]){
        LinkedListChallenge testOne = new LinkedListChallenge();
        LinkedListChallenge testTwo = new LinkedListChallenge();
        LinkedListChallenge testLoop = new LinkedListChallenge();
        testLoop = testLoop.addTo(testLoop, 1);
        testLoop = testLoop.addTo(testLoop, 2);
        testLoop = testLoop.addTo(testLoop, 3);
        testLoop.getBody().getTail().getTail().setTail(testLoop.getBody());
        LinkedListChallenge resultLoop = new LinkedListChallenge();
        resultLoop.setBody(resultLoop.checkLoop(testLoop));
        if(resultLoop == null){
            System.out.println("No loop found.");
        } else{
            System.out.println("Loop found at " + resultLoop.getBody().toString() );
        }
        testOne = testOne.addTo(testOne, 1);
        testOne = testOne.addTo(testOne, 2);
        testOne = testOne.addTo(testOne, 3);
        testTwo = testTwo.addTo(testTwo, 4);
        testTwo = testTwo.addTo(testTwo, 5);
        testTwo = testTwo.addTo(testTwo, 6);
        testTwo.getBody().getTail().getTail().setTail(testOne.getBody().getTail().getTail());

        LinkedListChallenge resultDuplicate = new LinkedListChallenge();
        resultDuplicate.setBody(resultDuplicate.duplicateCheck(testOne, testTwo));
        if(resultDuplicate.getBody() == null){
            System.out.println("No duplicate nodes found.");
        }else{
            System.out.println("Duplicate found at " + resultDuplicate.getBody());
        }

        System.out.println("Test reference " + testOne.getBody().getTail().getTail());

    }
}
