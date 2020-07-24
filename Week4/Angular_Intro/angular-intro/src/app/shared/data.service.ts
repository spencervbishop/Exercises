export class DataService{
    getDetails(){
        const resultPromise = new Promise((resolve, reject) =>{ //could call this success, failure
            setTimeout(()=>{
                resolve('Data');                                //success('Data');
            }, 1500)
        })
        return resultPromise;
    }
}