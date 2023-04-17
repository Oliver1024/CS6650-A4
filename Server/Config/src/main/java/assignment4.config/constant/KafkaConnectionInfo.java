package assignment4.config.constant;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
public class KafkaConnectionInfo {
  // three Kafka brokers private ip, no need to update every time
//  public static final String BROKER_1_IP = "172.31.28.39";
//  public static final String BROKER_2_IP = "172.31.31.63";


  private static final String KAFKA_BROKER1_IP = "35.86.146.7:9092"; // "172.31.21.127:2181";
  private static final String KAFKA_BROKER2_IP = "34.216.146.96:9092";// "172.31.23.50:2181";

  public static final String KAFKA_BROKERS_IP = KAFKA_BROKER1_IP + "," + KAFKA_BROKER2_IP;

  public static final String MATCHES_TOPIC = "matchesTopic";
  public static final String STATS_TOPIC = "statsTopic";

  public static final String MATCHES_CONSUMER_GROUP_ID = "matches-consumer";

  public static final String STATS_CONSUMER_GROUP_ID = "stats-consumer";




}
