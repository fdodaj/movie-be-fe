
class Movie {
  constructor(name, description) {
    this.name = name;
    this.description = description;
  }
  


}

const div = document.createElement('div');

document.querySelector('#movie-form').addEventListener('submit', (e) => {

  e.preventDefault;

  const name = document.querySelector('#name').value;
  const description = document.querySelector('#description').value;
  
  
  const json = {
    "name": name,
    "description": description
  };

  const xhr = new XMLHttpRequest();

  xhr.open('POST', 'http://localhost:8080/movies');


xhr.setRequestHeader('Content-Type', 'application/json');


xhr.send(JSON.stringify(json));

  prompt(JSON.stringify(json));


}, 5000);


const sendHttpRequest = (method, url, data) => {
  const promise = new Promise((resolve, reject) => {
    const xhr = new XMLHttpRequest();
    xhr.open(method, url);

    xhr.responseType = 'json';

    if (data) {
      xhr.setRequestHeader('Content-Type', 'application/json');
      xhr.setRequestHeader('Access-Control-Allow-Origin', '*');

    }

    xhr.onload = () => {
      if (xhr.status >= 400) {
        reject(xhr.response);
      } else {
        resolve(xhr.response);
      }
    };

    xhr.onerror = () => {
      reject('Something went wrong!');
    };

    xhr.send(JSON.stringify(data));
  });
  return promise;
};

// const getData = () => {
//   sendHttpRequest('GET', 'http://localhost:8080/movies').then(responseData => {




//   div1.appendChild(document.createTextNode(JSON.stringify(responseData)));

//     console.log(responseData);
//   });
// };


