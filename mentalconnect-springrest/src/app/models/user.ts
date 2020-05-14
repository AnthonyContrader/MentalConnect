export class User {
    id: number;
    username: string;
    password: string;
    usertype: string;

    constructor(id: number, username: string, password: string, usertype: string) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.usertype = usertype;
    }


}

