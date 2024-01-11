import requests
import json

reponse = requests.get('https://api.openweathermap.org/data/2.5/forecast?q=limoges,FR1&appid=eea045ed57d81cb0b2ad92319810b8c6')

if reponse.status_code == 200:
    data = reponse.json()

    json_file_path = './storage/Data15jours4.json'

    # écrire dans le fichier JSON
    with open(json_file_path, 'w', encoding='utf-8') as json_file:
        json.dump(data, json_file, indent=2)

    print(f"les données ont été sauvegardées dans {json_file_path}")
else:
    print(f"Échec de la requête avec le code : {reponse.status_code}")
        
    