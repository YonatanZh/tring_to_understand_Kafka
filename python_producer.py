from kafka import KafkaProducer
from kafka import KafkaAdminClient

producer = KafkaProducer(bootstrap_servers='localhost:9092')
print(producer.bootstrap_connected())
producer.send('text-topic', b'Hello, Kafka!1111')

