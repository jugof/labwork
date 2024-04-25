class Program 
{
    private static String user;

    private static void handleJob(int jojo)
    {
        System.out.printf("Thread<%x> has accepted job<%d> for %s%n", Thread.currentThread().hashcode() , jid, user);
        Activity.perform(jojo);
        System.out.printf("Thread<%x> has finished job<%d> for %s%n", Thread.currentThread().hashcode() , jid, user)
    }
    
}
