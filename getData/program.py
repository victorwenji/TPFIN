import requests
import json

def recuperer_donnees_et_enregistrer(api_url, nom_fichier):
    # Faire la requête à l'API
    reponse = requests.get(api_url)

    # Vérifier si la requête a réussi (code 200)
    if reponse.status_code == 200:
        # Charger les données JSON depuis la réponse
        donnees = reponse.json()

        # Enregistrer les données dans un fichier
        with open(nom_fichier, 'w') as fichier:
            json.dump(donnees, fichier)

        print(f'Données enregistrées avec succès dans {nom_fichier}')
    else:
        print(f'Erreur lors de la récupération des données. Code de statut : {reponse.status_code}')

# Exemple d'utilisation
api_url = 'https://exemple.com/api/donnees'
nom_fichier = 'donnees_api.json'

recuperer_donnees_et_enregistrer(api_url, nom_fichier)
