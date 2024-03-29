package io.turntabl.customer.logging;

import redis.clients.jedis.Jedis;

public class Log {
    public static void sendMessage(String message){
        Jedis jedis = null;
        try {
            /* Creating Jedis object for connecting with redis server */
            jedis = new Jedis("localhost");

            /* Publishing message to channel C1 */
            jedis.publish("removed", message);
            jedis.ping();

        } catch(Exception ex) {

            System.out.println("Exception : " + ex.getMessage());
        } finally {

            if(jedis != null) {
                jedis.close();
            }
        }
    }
}
