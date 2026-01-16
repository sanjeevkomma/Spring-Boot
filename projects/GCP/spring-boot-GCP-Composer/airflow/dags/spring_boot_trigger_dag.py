from airflow import DAG
from airflow.providers.http.operators.http import SimpleHttpOperator
from datetime import datetime

with DAG(
    dag_id="spring_boot_trigger_dag",
    start_date=datetime(2024, 1, 1),
    schedule_interval=None,
    catchup=False
) as dag:

    trigger_spring_boot = SimpleHttpOperator(
        task_id="trigger_spring_boot_api",
        http_conn_id="spring_boot_service",
        endpoint="/dataflow/trigger",
        method="POST",
        log_response=True
    )

    trigger_spring_boot
