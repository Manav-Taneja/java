export default function login(){
    console.log("hi there")
     return (
        <div>
            Hello world
        </div>
     )
}
export async function getServerSideProps(){
    console.log("inside the props");
    return {
        props:{},
    }
}
